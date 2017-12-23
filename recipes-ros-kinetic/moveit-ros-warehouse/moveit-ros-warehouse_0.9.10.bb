# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to MongoDB"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-ros-planning rosconsole roscpp tf warehouse-ros"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_warehouse/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3eb1da169201ccaf7b8d451e55f8fb47"
SRC_URI[sha256sum] = "2d975d8512f9dbf29676799882c8f7ee4effd3c18c5c1a3198377bfbb884f7bf"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_warehouse-0.9.10-0"

inherit catkin
