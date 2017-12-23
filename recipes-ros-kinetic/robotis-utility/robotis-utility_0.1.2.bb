# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the ROBOTIS Utility (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ros-madplay-player ros-mpg321-player"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Utility-release/archive/release/kinetic/robotis_utility/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b58e3f124d3d16b96e7aa15cf97321e9"
SRC_URI[sha256sum] = "3553a0c1a59800afb58806ae7c2c9933b431425cd2206bd31f3810cba67349ca"
S = "${WORKDIR}/ROBOTIS-Utility-release-release-kinetic-robotis_utility-0.1.2-0"

inherit catkin
