# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to perception"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge eigen glut image-transport libglew-dev message-filters moveit-core moveit-msgs octomap opengl pluginlib rosconsole roscpp sensor-msgs tf tf-conversions urdf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_perception/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92985662db0804bef7bfb1f0c94d780a"
SRC_URI[sha256sum] = "b8dc88383d6f461a0746fd153fd1e9aad01677053b3f008a3c6b35d4e7135d7b"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_perception-0.9.10-0"

inherit catkin
