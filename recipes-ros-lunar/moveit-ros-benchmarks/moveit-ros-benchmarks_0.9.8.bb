# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Enhanced tools for benchmarks in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin moveit-ros-planning moveit-ros-warehouse pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_benchmarks/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f3b221639126229aab7bff27bc34b3e5"
SRC_URI[sha256sum] = "fd7a608530cbc06ee56f80b22bae805eb40b4077b7a16549041e396a8c1fb804"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
