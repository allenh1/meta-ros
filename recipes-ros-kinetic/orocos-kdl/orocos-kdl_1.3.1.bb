# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics     Librar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake eigen pkgconfig"
SRC_URI = "https://github.com/smits/${PN}-release/archive/release/kinetic/orocos_kdl/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c0d22e8a934343fb2acfa4fe7b5346d"
SRC_URI[sha256sum] = "7cbda0a837a7025739715ffab17b5f916d671eec8dfeb26a20ba80bfc0463590"
S = "${WORKDIR}/${PN}-release-release-kinetic-orocos_kdl-1.3.1-0"

inherit catkin
