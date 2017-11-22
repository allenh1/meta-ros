# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nodelet package is designed to provide a way to run multiple     algorithms "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondcpp boost catkin cmake-modules message-generation message-runtime pluginlib rosconsole roscpp rospy std-msgs uuid"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet/1.9.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24c6fc16ccbfb3e93ea1b8907008696e"
SRC_URI[sha256sum] = "2e33f0e4f3eca5affab08c6c7ee240071e0133516870b9137ac164a4f883d121"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet-1.9.14-0"

inherit catkin
