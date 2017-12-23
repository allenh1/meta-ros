# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description for Universal UR5/10 robot arms"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native urdf"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur_description/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23dab3acbbfabb7c805f7d3db10fc708"
SRC_URI[sha256sum] = "25bae76377119252f0baf2c4ad35cd3a413628e0f9e93193f7b1a629e9b6de9b"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur_description-1.2.0-0"

inherit catkin
