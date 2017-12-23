# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SVH Driver wrapper to enable control of the Schunk five finger hand"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native dynamic-reconfigure fzi-icl-comm fzi-icl-core roscpp rospy rqt-gui rqt-gui-py sensor-msgs std-msgs urdf xacro"
SRC_URI = "https://github.com/fzi-forschungszentrum-informatik/schunk_svh_driver-release/archive/release/kinetic/schunk_svh_driver/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65565b69786dd89d6c405d6f7af13359"
SRC_URI[sha256sum] = "454534ca0f2ab9dcaadac08692c0c972dcd737de3df41092ac28d0df03c2f7d8"
S = "${WORKDIR}/schunk_svh_driver-release-release-kinetic-schunk_svh_driver-0.2.0-0"

inherit catkin
