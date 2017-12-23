# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Reactive navigation for 2D robots using MRPT navigation algorithms (TP-Space)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native dynamic-reconfigure geometry-msgs mrpt-bridge roscpp tf visualization-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_reactivenav2d/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbcbc8d98724c198196a1ae982d3a085"
SRC_URI[sha256sum] = "21f53641cccb6376124639486ca3d96f2ca73ed0334a3a15f58ac5a284fc2c12"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_reactivenav2d-0.1.18-0"

inherit catkin
