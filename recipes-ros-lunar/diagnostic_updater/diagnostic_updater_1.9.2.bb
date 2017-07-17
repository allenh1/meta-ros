# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_updater contains tools for easily updating diagnostics. it is commonl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_msgs roscpp rostest std_msgs"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/diagnostic_updater/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "796d2dee1b7ae1da47aad37163b742be"
SRC_URI[sha256sum] = "0bd0399a95ce493ba05dc0986e8fed440705ad9107e25a7ea9e6ba899a458edb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
