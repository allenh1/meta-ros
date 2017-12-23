# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_network_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater dynamic-reconfigure message-generation message-runtime roscpp rospy rostest sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/jsk_network_tools/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6ecf956164c02aa4864ff8b25b1ea04"
SRC_URI[sha256sum] = "a43856c0eb62887df4fdc0f3b4953d472621f2abdd58f7657d5818bc9e18ef20"
S = "${WORKDIR}/jsk_common-release-release-kinetic-jsk_network_tools-2.2.5-0"

inherit catkin
