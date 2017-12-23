# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_rviz_plugins package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge diagnostic-msgs dynamic-reconfigure geometry-msgs image-geometry jsk-footstep-msgs jsk-gui-msgs jsk-hark-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools message-generation mk people-msgs rosbuild rviz std-msgs urdfdom-py view-controller-msgs"
SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/kinetic/jsk_rviz_plugins/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4275dd86ea1fa84281f9f2693ba816bb"
SRC_URI[sha256sum] = "ccf0bfdeec0f70f46f6b5c551fca79e6d6d6abba796b65594ffb0b4ae8af3753"
S = "${WORKDIR}/jsk_visualization-release-release-kinetic-jsk_rviz_plugins-2.1.1-0"

inherit catkin
