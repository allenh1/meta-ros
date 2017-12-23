# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bin-pose-msgs catkin-native roscpp tf visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/durovsky/binpicking_utils-release/archive/release/kinetic/bin_pose_emulator/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ab5502efaf9889d67d328d1bdae1798"
SRC_URI[sha256sum] = "28a3761aec2c63b42f99aaca2fea78f9d6b48f155fe07d8635979153b3880dd5"
S = "${WORKDIR}/binpicking_utils-release-release-kinetic-bin_pose_emulator-0.1.4-0"

inherit catkin
