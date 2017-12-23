# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Plugin-based layers for the navigation stack that    implement various social na"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native costmap-2d dynamic-reconfigure people-msgs roscpp"
SRC_URI = "https://github.com/wu-robotics/navigation_layers_release/archive/release/kinetic/social_navigation_layers/0.3.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b02ff3f6ee4ae2a7dccef2b979d9234a"
SRC_URI[sha256sum] = "b91f57c0dccbe5ca62c5bb704003413904caf8c9ca0ba32c66f8706c12c03016"
S = "${WORKDIR}/navigation_layers_release-release-kinetic-social_navigation_layers-0.3.1-1"

inherit catkin
