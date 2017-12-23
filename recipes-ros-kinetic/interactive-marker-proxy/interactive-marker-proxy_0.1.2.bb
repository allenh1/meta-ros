# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Proxy Server for Interactive Markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interactive-markers message-generation message-runtime roscpp visualization-msgs"
SRC_URI = "https://github.com/RobotWebTools-release/interactive_marker_proxy-release/archive/release/kinetic/interactive_marker_proxy/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d6d30ec31ca16dc31a8aa08d5815d17"
SRC_URI[sha256sum] = "e8897cc0cdf968b281e777aa3362da2cd5405c79b20f4b7d591997fdb8e187a9"
S = "${WORKDIR}/interactive_marker_proxy-release-release-kinetic-interactive_marker_proxy-0.1.2-0"

inherit catkin
