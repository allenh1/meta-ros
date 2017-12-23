# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The operator is a lightweight, purely reactive obstacle-avoidance     module for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native costmap-2d message-generation message-runtime roscpp sensor-msgs tf"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_operator/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de4446aede92f6d038f510379ca99023"
SRC_URI[sha256sum] = "3261678917200a28bf0bba2b608fb70aacd15feabf1c0747f1faa4f618083841"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_operator-0.3.2-0"

inherit catkin
