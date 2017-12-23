# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosservice contains the rosservice command-line tool for listing     and queryin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genpy rosgraph roslib rosmsg rospy"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1610e11995d5772ca8160343633b9a1"
SRC_URI[sha256sum] = "a4266f37eed6671ea346dc6ce92a6410a4182da04343430d6b109084fbcd1950"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin
