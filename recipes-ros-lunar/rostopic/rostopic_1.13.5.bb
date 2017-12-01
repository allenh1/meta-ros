# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rostopic contains the rostopic command-line tool for displaying     debug inform"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genpy rosbag rospy rostest"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7bd8c4381faa71d3ebdb33ccb5f497f"
SRC_URI[sha256sum] = "60317b487cd3743a7aa5da80c04aeeb79a189f1919c546c8d524829de0bf0a41"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin
