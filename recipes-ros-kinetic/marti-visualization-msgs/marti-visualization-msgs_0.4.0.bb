# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_visualization_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_visualization_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e677c71bd6a904d79d2d5f0a662a6f7b"
SRC_URI[sha256sum] = "5fe65dde5aa2aaf494d5f9e31750ea35167a676af23036d81c5f4774e1124155"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_visualization_msgs-0.4.0-0"

inherit catkin
