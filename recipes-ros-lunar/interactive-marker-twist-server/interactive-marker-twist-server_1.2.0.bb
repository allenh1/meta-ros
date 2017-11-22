# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interactive control for generic Twist-based robots using interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin interactive-markers roscpp visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/interactive_marker_twist_server-release/archive/release/lunar/interactive_marker_twist_server/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d38beea74c3316476c8be029c2955f8"
SRC_URI[sha256sum] = "858ba92c40fc86e1fca4699a46ad339c16cb472fd38440dbc795042b14ef3487"
S = "${WORKDIR}/interactive_marker_twist_server-release-release-lunar-interactive_marker_twist_server-1.2.0-0"

inherit catkin
