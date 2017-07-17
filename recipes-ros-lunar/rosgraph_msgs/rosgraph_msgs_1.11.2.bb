# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages relating to the ROS Computation Graph. These are generally considered t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/lunar/rosgraph_msgs/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "49ede31404d4666a0f52dacb78e408dd"
SRC_URI[sha256sum] = "1a0d3852c1e703a72777666c2acd122dc75d264177cdd31e2a5201250f4baa57"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
