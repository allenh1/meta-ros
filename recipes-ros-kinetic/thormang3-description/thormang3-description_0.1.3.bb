# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The thormang3_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-Common-release/archive/release/kinetic/thormang3_description/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "099199815db6a7bb2240482985734d2b"
SRC_URI[sha256sum] = "b6608d669a22e5417d2f23f2308b0c44ae35015a43af66c2d9edaf09b4998eb0"
S = "${WORKDIR}/ROBOTIS-THORMANG-Common-release-release-kinetic-thormang3_description-0.1.3-0"

inherit catkin
