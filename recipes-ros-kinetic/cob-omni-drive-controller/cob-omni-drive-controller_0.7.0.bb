# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_omni_drive_controller package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "angles boost catkin-native controller-interface dynamic-reconfigure geometry-msgs hardware-interface message-generation message-runtime nav-msgs realtime-tools roscpp sensor-msgs std-msgs std-srvs tf urdf"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_omni_drive_controller/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a23ea24f0c54943ce5d741e716b4c1ca"
SRC_URI[sha256sum] = "f733494ae0eaf229c0788179671a650ee2f8052adad5bd9356cd356ad1b9ad44"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_omni_drive_controller-0.7.0-0"

inherit catkin
