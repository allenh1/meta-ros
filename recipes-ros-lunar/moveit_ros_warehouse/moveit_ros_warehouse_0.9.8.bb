# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin moveit_ros_planning rosconsole roscpp tf warehouse_ros"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_warehouse/0.9.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "808f575aa16028982e2d58f637590238"
SRC_URI[sha256sum] = "f42e57852802904b3e24cf060a986e5e007423a2a21c06056105cb472467723f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
