# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains a set of tools that can be used from a hard
    realtime thread, withou"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=f7a61262707cb1bb61fab1381094f514"

DEPENDS = "catkin roscpp rospy"
SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/lunar/realtime_tools/1.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59e95d3530d4e06e4f90cf4ab3d9c499"
SRC_URI[sha256sum] = "08cf2961a536dd3f94057c1f632d035653103bddea05fbe445b4f514f0c14fd1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
