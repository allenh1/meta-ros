# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Plays rosbags as though they were happening NOW."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosbag rospy"
SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/kinetic/${PN}/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5f21e6f69abbd36346c9ee06d74b37b1"
SRC_URI[sha256sum] = "05f114eeab224925fdc550ca9e6181eab2415920984f0eb8fc017de138da44dd"
S = "${WORKDIR}/wu_ros_tools-release-kinetic-${PN}-0.2.4-0"

inherit catkin
