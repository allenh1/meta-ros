# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta package that contains all essential package of MoveIt!. Until Summer 2016 M"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-commander moveit-core moveit-planners moveit-plugins moveit-ros moveit-setup-assistant"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2e28716cc7180e1d0c3c866197d4394d"
SRC_URI[sha256sum] = "4d28a3bd15d4b00ec93a63f1078d1548a84aa05ffc8c81ebdffd0a4625b02184"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.9.9-0"

inherit catkin
