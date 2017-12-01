# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D interactive marker communication library for RViz and similar tools."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native rosconsole roscpp rospy rostest std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/interactive_markers-release/archive/release/lunar/interactive_markers/1.11.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fe8079528de80b6e34ead948c9c08c88"
SRC_URI[sha256sum] = "43359e030f6c01b73645bd253f0c97bdbe9ae93820dca0ab05db127936d0c795"
S = "${WORKDIR}/interactive_markers-release-release-lunar-interactive_markers-1.11.3-0"

inherit catkin
