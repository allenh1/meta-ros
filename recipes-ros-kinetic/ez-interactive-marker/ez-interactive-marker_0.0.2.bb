# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Easily create interactive markers from yaml files"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interactive-markers roslib rospy rospy-message-converter rostest std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/neka-nat/ez_interactive_marker-release/archive/release/kinetic/ez_interactive_marker/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a3c355055e5cd4fd05e73fa29f2d467f"
SRC_URI[sha256sum] = "eedeb0e20406c9ae3c30e3613ab12589fe5904243fcf2d14ac98fce2951e6a54"
S = "${WORKDIR}/ez_interactive_marker-release-release-kinetic-ez_interactive_marker-0.0.2-0"

inherit catkin
