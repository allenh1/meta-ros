# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "urg_node"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater dynamic-reconfigure laser-proc message-generation message-runtime nodelet rosconsole roscpp sensor-msgs std-msgs std-srvs tf urg-c"
SRC_URI = "https://github.com/ros-gbp/urg_node-release/archive/release/kinetic/urg_node/0.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c36de35a6bca1e6262fa3135b603c24"
SRC_URI[sha256sum] = "8e3154c0e0e1c02a4aa54733d79a4bc78c74108b258de57b2908bd3c976464b0"
S = "${WORKDIR}/urg_node-release-release-kinetic-urg_node-0.1.11-0"

inherit catkin
