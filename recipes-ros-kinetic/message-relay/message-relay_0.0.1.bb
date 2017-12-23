# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package to programmatically spawn message, service, and action relays. To add su"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native controller-manager-msgs diagnostic-msgs gazebo-msgs geometry-msgs map-msgs move-base-msgs multimaster-msgs nav-msgs python-cheetah robot-localization roscpp rosgraph-msgs sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/kinetic/message_relay/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed567ade525846b4a989c3004b7e298b"
SRC_URI[sha256sum] = "8315b1329b1319e3d3580927eed17a77ea2ab2e8726f6c7dc7d944829f120eab"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-kinetic-message_relay-0.0.1-0"

inherit catkin
