# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to perception"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge eigen glut image-transport libglew-dev message-filters moveit-core moveit-msgs octomap opengl pluginlib rosconsole roscpp sensor-msgs tf tf-conversions urdf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_perception/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "286f32ed1363cd1b06d4bd6dfaad1940"
SRC_URI[sha256sum] = "0d1148d1a460e4b567d62b3889ec610368827ba3aecaca6b42ab953fea6e3ed3"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_perception-0.9.9-0"

inherit catkin
