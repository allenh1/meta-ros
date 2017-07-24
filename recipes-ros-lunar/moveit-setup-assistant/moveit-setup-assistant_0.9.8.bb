# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates a configuration package that makes it easy to use MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-core moveit-ros-planning moveit-ros-visualization srdfdom xacro yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_setup_assistant/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc42e39f725a50cc6fc81045966efaba"
SRC_URI[sha256sum] = "e3a9e0c49f61c2510d647519fb092398ad8f72956fab8cbb20f983b337e32beb"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_setup_assistant-0.9.8-0"

inherit catkin
