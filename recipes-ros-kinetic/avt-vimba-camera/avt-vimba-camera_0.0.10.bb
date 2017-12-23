# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper of the Allied Vision Technologies (AVT) VIMBA Ethernet and Firewire SDK."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native diagnostic-updater dynamic-reconfigure image-geometry image-transport message-filters polled-camera roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/srv/avt_vimba_camera-release/archive/release/kinetic/avt_vimba_camera/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "396a3f6a319ecee93ef60ae9a667ba55"
SRC_URI[sha256sum] = "bd7f88e11df09fc332ada9f3f0e595b1e70c83ac9a9294a4a0b0e2269e795e4f"
S = "${WORKDIR}/avt_vimba_camera-release-release-kinetic-avt_vimba_camera-0.0.10-0"

inherit catkin
