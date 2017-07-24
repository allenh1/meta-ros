# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to MongoDB"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native moveit-ros-planning rosconsole roscpp tf warehouse-ros"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_warehouse/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "808f575aa16028982e2d58f637590238"
SRC_URI[sha256sum] = "f42e57852802904b3e24cf060a986e5e007423a2a21c06056105cb472467723f"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_warehouse-0.9.8-0"

inherit catkin
