# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to perception"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native cv-bridge eigen glut image-transport libglew-dev message-filters moveit-core moveit-msgs octomap opengl pluginlib rosconsole roscpp sensor-msgs tf tf-conversions urdf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_perception/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8bddbdf37954407225f7f108e905c7c"
SRC_URI[sha256sum] = "deb22798c0b51d1acd7b59b4e200805a9b960f7d5174ec9c7eafdec474f95f75"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_perception-0.9.8-0"

inherit catkin
