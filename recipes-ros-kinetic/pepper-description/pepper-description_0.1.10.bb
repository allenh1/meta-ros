# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pepper_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native robot-state-publisher urdf xacro"
SRC_URI = "https://github.com/ros-naoqi/pepper_robot-release/archive/release/kinetic/pepper_description/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1dc0dba01fb403f6e3e78bcd0b831ca9"
SRC_URI[sha256sum] = "c355d3844b9e234ce7917618b55fb25c25e5b2dff7a3aea71d909767a3dfa3b0"
S = "${WORKDIR}/pepper_robot-release-release-kinetic-pepper_description-0.1.10-0"

inherit catkin
