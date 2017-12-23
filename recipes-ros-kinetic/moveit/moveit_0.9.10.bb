# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta package that contains all essential package of MoveIt!. Until Summer 2016 M"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-commander moveit-core moveit-planners moveit-plugins moveit-ros moveit-setup-assistant"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b46b654ae7d4c9c9d52aa9fde9db3a59"
SRC_URI[sha256sum] = "f7be788f654974d18e28329d8e69d3c5435bfb4548a7e73bc8a74f334d98d53e"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.9.10-0"

inherit catkin
