# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS node for using libsensors to provide diagnostics information about the sen"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater libsensors4-dev roscpp"
SRC_URI = "https://github.com/ros-gbp/linux_peripheral_interfaces-release/archive/release/kinetic/libsensors_monitor/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c28433eebc88ac8609dff6e014410d62"
SRC_URI[sha256sum] = "aff4a809302d370d75499dccc31136723e8b69293ed6b8bd4de011b88337e749"
S = "${WORKDIR}/linux_peripheral_interfaces-release-release-kinetic-libsensors_monitor-0.2.0-0"

inherit catkin
