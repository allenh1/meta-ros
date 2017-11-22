# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The abseil_cpp package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=211ba54883815de9f52a3dcd9f281523"

DEPENDS = "catkin rsync"
SRC_URI = "https://github.com/Eurecat/abseil_cpp-release/archive/release/lunar/abseil_cpp/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "646ea83ad48feaa0c378805f3de02c20"
SRC_URI[sha256sum] = "e521766908e0b12b0879347524b56e1447782d76067aabaa115adbd3b566ea5e"
S = "${WORKDIR}/abseil_cpp-release-release-lunar-abseil_cpp-0.2.3-0"

inherit catkin
