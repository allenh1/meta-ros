# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=6;endline=6;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules common_msgs gencpp geneus genlisp genmsg gennodejs genpy message_generation message_runtime ros ros_comm rosbag_migration_rule rosconsole_bridge roscpp_core rosgraph_msgs roslisp rospack std_msgs std_srvs"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/ros_core/1.3.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d1cd633d116977873f093042c2af2b8"
SRC_URI[sha256sum] = "5a7d1db4bc048216d5fb0552b3c1ed3fc33a178186e4bc6609cf61684ad7aa6d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
