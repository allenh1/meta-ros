# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multisense_lib"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge libpng12-dev"
SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/kinetic/multisense_lib/4.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "41a1cc12f4b7535561c74887a7e80d8b"
SRC_URI[sha256sum] = "61612458f72d81d91f80bd87186b457a672a1ed8039a4732c151c6d507d4a539"
S = "${WORKDIR}/multisense_ros-release-release-kinetic-multisense_lib-4.0.0-0"

inherit catkin
