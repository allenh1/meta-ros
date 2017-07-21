# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosservice contains the rosservice command-line tool for listing     and queryin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin genpy rosgraph roslib rosmsg rospy"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosservice/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e6b51a662075dc484f7576aa2ea5fd4"
SRC_URI[sha256sum] = "e5da7a3cc4efaf5da02a3cca167a6278039c0e508785116565ac395614f5f455"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosservice-1.13.0-0"

inherit catkin
