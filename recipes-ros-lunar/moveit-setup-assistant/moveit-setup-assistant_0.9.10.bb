# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates a configuration package that makes it easy to use MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-ros-planning moveit-ros-visualization srdfdom xacro yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_setup_assistant/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "801f28914ae9f3b0069ff1e895406e99"
SRC_URI[sha256sum] = "9045b8e0a495d547035b66f8be8ceaf66c928021e7a47cedf0f7bddaa50b10dc"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_setup_assistant-0.9.10-0"

inherit catkin
