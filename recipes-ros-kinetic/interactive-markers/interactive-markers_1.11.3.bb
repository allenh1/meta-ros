# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D interactive marker communication library for RViz and similar tools."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native rosconsole roscpp rospy rostest std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/interactive_markers-release/archive/release/kinetic/interactive_markers/1.11.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "524943827f6a712240e60d3f25e0c61f"
SRC_URI[sha256sum] = "ba4409ef114c440a1a2f007b1677ec2e4848777ad69762b5c44972cd142e8880"
S = "${WORKDIR}/interactive_markers-release-release-kinetic-interactive_markers-1.11.3-0"

inherit catkin
