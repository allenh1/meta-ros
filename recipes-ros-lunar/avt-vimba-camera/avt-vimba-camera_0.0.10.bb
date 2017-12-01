# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper of the Allied Vision Technologies (AVT) VIMBA Ethernet and Firewire SDK."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native diagnostic-updater dynamic-reconfigure image-geometry image-transport message-filters polled-camera roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/srv/avt_vimba_camera-release/archive/release/lunar/avt_vimba_camera/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5ec49d018531948fced5c1a74ff91d0"
SRC_URI[sha256sum] = "0417426b4543a959b79ebb1e326eb998be8690493af552066c6148f4bd9ef903"
S = "${WORKDIR}/avt_vimba_camera-release-release-lunar-avt_vimba_camera-0.0.10-0"

inherit catkin
