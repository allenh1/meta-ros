# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics     Librar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d2740cd2c4139b24d7392872077c634a"

DEPENDS = "catkin cmake eigen pkgconfig"
SRC_URI = "https://github.com/smits/orocos-kdl-release/archive/release/lunar/orocos_kdl/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0fe125f52c0517810c8aa793b1500c7d"
SRC_URI[sha256sum] = "f1c1fe4d24b484ec149313b54c9258832c55de058739d4ff29ab833201aa5132"
S = "${WORKDIR}/orocos-kdl-release-release-lunar-orocos_kdl-1.3.1-0"

inherit catkin
