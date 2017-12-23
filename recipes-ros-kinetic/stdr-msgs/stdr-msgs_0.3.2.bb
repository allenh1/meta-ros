# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides msgs, services and actions for STDR Simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime nav-msgs std-msgs"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_msgs/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60386098590bd9e895a78fd97f7df6a6"
SRC_URI[sha256sum] = "6b6018788a554d44f1ab86af880a8caf311952dd68a85f0b02f76400de4f6eb0"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_msgs-0.3.2-0"

inherit catkin
