# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interactive control for generic Twist-based robots using interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interactive-markers roscpp visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/interactive_marker_twist_server-release/archive/release/kinetic/interactive_marker_twist_server/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "49067cf3cdc1fcf46f80e19193e1ef64"
SRC_URI[sha256sum] = "af453490a78b550877d0ec79593922b0c8810e3716b3bb72d242e10db0e21969"
S = "${WORKDIR}/interactive_marker_twist_server-release-release-kinetic-interactive_marker_twist_server-1.2.0-0"

inherit catkin
