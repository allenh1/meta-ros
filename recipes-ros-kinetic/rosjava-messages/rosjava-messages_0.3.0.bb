# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message generation for rosjava."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib-msgs ar-track-alvar-msgs catkin-native concert-msgs concert-service-msgs diagnostic-msgs gateway-msgs genjava geometry-msgs move-base-msgs nav-msgs rocon-app-manager-msgs rocon-device-msgs rocon-interaction-msgs rocon-service-pair-msgs rocon-std-msgs rocon-tutorial-msgs roscpp rosgraph-msgs rosjava-build-tools rosjava-test-msgs scheduler-msgs sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs uuid-msgs visualization-msgs world-canvas-msgs yocs-msgs"
SRC_URI = "https://github.com/rosjava-release/rosjava_messages-release/archive/release/kinetic/rosjava_messages/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e520fe1114219c99d9cd10749cb2a41d"
SRC_URI[sha256sum] = "aa5ca5d61770bf5b1853c10efc5780e74ec0ba19f8d18ba739f707eb7e84a10c"
S = "${WORKDIR}/rosjava_messages-release-release-kinetic-rosjava_messages-0.3.0-0"

inherit catkin
