# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cell"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native costmap-2d cv-bridge dynamic-reconfigure geometry-msgs message-generation message-runtime pluginlib roscpp std-msgs"
SRC_URI = "https://github.com/rst-tu-dortmund/costmap_converter-release/archive/release/kinetic/costmap_converter/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ddc57b6c679eb4b401b67d3523a4b3dc"
SRC_URI[sha256sum] = "a47e6d5f02fce49614ec002ea04c08120d349515bc02fc948de00cdda1edafed"
S = "${WORKDIR}/costmap_converter-release-release-kinetic-costmap_converter-0.0.7-0"

inherit catkin
