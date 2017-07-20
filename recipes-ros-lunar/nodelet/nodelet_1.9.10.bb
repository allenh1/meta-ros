# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nodelet package is designed to provide a way to run multiple     algorithms "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "bondcpp boost catkin cmake_modules message_generation message_runtime pluginlib rosconsole roscpp rospy std_msgs uuid"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet/1.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c35cd161ae979c367697f8763064dad0"
SRC_URI[sha256sum] = "13754aa4ae5eb8da4bd8dffe683e1f3f26199a003f2c7deeb2107f0dbe45d48a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
