# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta package that contains all essential package of MoveIt!. Until Summer 2016 M"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin moveit-commander moveit-core moveit-planners moveit-plugins moveit-ros moveit-setup-assistant"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac8581fe655e1fb675a2d217d27843e1"
SRC_URI[sha256sum] = "464f1aedec2f91df25399d5f44f1cf1563beebe0b6184bdd2682f019472300ac"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.9.10-0"

inherit catkin
