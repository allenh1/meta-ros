# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_interactive_test"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native jsk-interactive jsk-interactive-marker mk rosbuild rospy rviz visualization-msgs"
SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/kinetic/jsk_interactive_test/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a50737e041356564ff7938acf53ad23f"
SRC_URI[sha256sum] = "340be87ddaba0b71686d2d0cba68d58d5f471cc5f93684f88f8880daa281b466"
S = "${WORKDIR}/jsk_visualization-release-release-kinetic-jsk_interactive_test-2.1.1-0"

inherit catkin
