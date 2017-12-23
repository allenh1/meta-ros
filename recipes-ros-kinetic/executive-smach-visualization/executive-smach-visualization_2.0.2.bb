# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on the SMACH visualization tools."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native smach-viewer"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/kinetic/executive_smach_visualization/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc1e2537c48e7fe766eea38208cd66fe"
SRC_URI[sha256sum] = "55d0c837bec9135e7f728c5e88deda303cbb655059417bbd309f70f2eda581bd"
S = "${WORKDIR}/executive_smach_visualization-release-release-kinetic-executive_smach_visualization-2.0.2-0"

inherit catkin
